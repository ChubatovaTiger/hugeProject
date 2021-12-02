package subProj_1696

import subProj_1696.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1696")
    name = "subProj 1696"

    buildType(subProj_bt_1696_3)
    buildType(subProj_bt_1696_2)
    buildType(subProj_bt_1696_1)
    buildType(subProj_bt_1696_0)
    buildType(subProj_bt_1696_5)
    buildType(subProj_bt_1696_4)
})
