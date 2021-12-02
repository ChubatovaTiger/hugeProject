package subProj_123

import subProj_123.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_123")
    name = "subProj 123"

    buildType(subProj_bt_123_5)
    buildType(subProj_bt_123_4)
    buildType(subProj_bt_123_3)
    buildType(subProj_bt_123_2)
    buildType(subProj_bt_123_1)
    buildType(subProj_bt_123_0)
})
