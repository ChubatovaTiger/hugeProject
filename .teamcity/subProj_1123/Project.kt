package subProj_1123

import subProj_1123.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1123")
    name = "subProj 1123"

    buildType(subProj_bt_1123_2)
    buildType(subProj_bt_1123_1)
    buildType(subProj_bt_1123_4)
    buildType(subProj_bt_1123_3)
    buildType(subProj_bt_1123_5)
    buildType(subProj_bt_1123_0)
})
