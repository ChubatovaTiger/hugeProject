package subProj_182

import subProj_182.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_182")
    name = "subProj 182"

    buildType(subProj_bt_182_2)
    buildType(subProj_bt_182_1)
    buildType(subProj_bt_182_4)
    buildType(subProj_bt_182_3)
    buildType(subProj_bt_182_5)
    buildType(subProj_bt_182_0)
})
