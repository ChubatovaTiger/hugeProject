package subProj_666

import subProj_666.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_666")
    name = "subProj 666"

    buildType(subProj_bt_666_5)
    buildType(subProj_bt_666_4)
    buildType(subProj_bt_666_3)
    buildType(subProj_bt_666_2)
    buildType(subProj_bt_666_1)
    buildType(subProj_bt_666_0)
})
