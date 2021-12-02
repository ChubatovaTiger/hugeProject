package subProj_1165

import subProj_1165.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1165")
    name = "subProj 1165"

    buildType(subProj_bt_1165_5)
    buildType(subProj_bt_1165_4)
    buildType(subProj_bt_1165_3)
    buildType(subProj_bt_1165_2)
    buildType(subProj_bt_1165_1)
    buildType(subProj_bt_1165_0)
})
