package subProj_138

import subProj_138.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_138")
    name = "subProj 138"

    buildType(subProj_bt_138_5)
    buildType(subProj_bt_138_4)
    buildType(subProj_bt_138_3)
    buildType(subProj_bt_138_2)
    buildType(subProj_bt_138_1)
    buildType(subProj_bt_138_0)
})
