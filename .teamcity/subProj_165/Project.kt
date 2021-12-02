package subProj_165

import subProj_165.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_165")
    name = "subProj 165"

    buildType(subProj_bt_165_0)
    buildType(subProj_bt_165_1)
    buildType(subProj_bt_165_2)
    buildType(subProj_bt_165_3)
    buildType(subProj_bt_165_4)
    buildType(subProj_bt_165_5)
})
