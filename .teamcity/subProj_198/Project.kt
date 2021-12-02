package subProj_198

import subProj_198.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_198")
    name = "subProj 198"

    buildType(subProj_bt_198_2)
    buildType(subProj_bt_198_3)
    buildType(subProj_bt_198_0)
    buildType(subProj_bt_198_1)
    buildType(subProj_bt_198_4)
    buildType(subProj_bt_198_5)
})
