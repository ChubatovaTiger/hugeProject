package subProj_1908

import subProj_1908.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1908")
    name = "subProj 1908"

    buildType(subProj_bt_1908_3)
    buildType(subProj_bt_1908_2)
    buildType(subProj_bt_1908_5)
    buildType(subProj_bt_1908_4)
    buildType(subProj_bt_1908_1)
    buildType(subProj_bt_1908_0)
})
