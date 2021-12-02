package subProj_1666

import subProj_1666.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1666")
    name = "subProj 1666"

    buildType(subProj_bt_1666_5)
    buildType(subProj_bt_1666_0)
    buildType(subProj_bt_1666_3)
    buildType(subProj_bt_1666_4)
    buildType(subProj_bt_1666_1)
    buildType(subProj_bt_1666_2)
})
