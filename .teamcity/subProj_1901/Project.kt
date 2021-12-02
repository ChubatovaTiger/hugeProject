package subProj_1901

import subProj_1901.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1901")
    name = "subProj 1901"

    buildType(subProj_bt_1901_0)
    buildType(subProj_bt_1901_2)
    buildType(subProj_bt_1901_1)
    buildType(subProj_bt_1901_4)
    buildType(subProj_bt_1901_3)
    buildType(subProj_bt_1901_5)
})