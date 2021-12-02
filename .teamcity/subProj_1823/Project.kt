package subProj_1823

import subProj_1823.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1823")
    name = "subProj 1823"

    buildType(subProj_bt_1823_0)
    buildType(subProj_bt_1823_1)
    buildType(subProj_bt_1823_2)
    buildType(subProj_bt_1823_3)
    buildType(subProj_bt_1823_4)
    buildType(subProj_bt_1823_5)
})
