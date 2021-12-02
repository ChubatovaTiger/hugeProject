package subProj_216

import subProj_216.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_216")
    name = "subProj 216"

    buildType(subProj_bt_216_1)
    buildType(subProj_bt_216_2)
    buildType(subProj_bt_216_3)
    buildType(subProj_bt_216_4)
    buildType(subProj_bt_216_0)
    buildType(subProj_bt_216_5)
})
