package subProj_1420

import subProj_1420.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1420")
    name = "subProj 1420"

    buildType(subProj_bt_1420_0)
    buildType(subProj_bt_1420_5)
    buildType(subProj_bt_1420_1)
    buildType(subProj_bt_1420_2)
    buildType(subProj_bt_1420_3)
    buildType(subProj_bt_1420_4)
})
