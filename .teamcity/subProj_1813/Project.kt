package subProj_1813

import subProj_1813.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1813")
    name = "subProj 1813"

    buildType(subProj_bt_1813_0)
    buildType(subProj_bt_1813_5)
    buildType(subProj_bt_1813_1)
    buildType(subProj_bt_1813_2)
    buildType(subProj_bt_1813_3)
    buildType(subProj_bt_1813_4)
})
