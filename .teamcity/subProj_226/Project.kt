package subProj_226

import subProj_226.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_226")
    name = "subProj 226"

    buildType(subProj_bt_226_3)
    buildType(subProj_bt_226_2)
    buildType(subProj_bt_226_5)
    buildType(subProj_bt_226_4)
    buildType(subProj_bt_226_1)
    buildType(subProj_bt_226_0)
})
