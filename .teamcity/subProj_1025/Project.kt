package subProj_1025

import subProj_1025.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1025")
    name = "subProj 1025"

    buildType(subProj_bt_1025_3)
    buildType(subProj_bt_1025_2)
    buildType(subProj_bt_1025_1)
    buildType(subProj_bt_1025_0)
    buildType(subProj_bt_1025_5)
    buildType(subProj_bt_1025_4)
})
