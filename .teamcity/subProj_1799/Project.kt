package subProj_1799

import subProj_1799.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1799")
    name = "subProj 1799"

    buildType(subProj_bt_1799_5)
    buildType(subProj_bt_1799_4)
    buildType(subProj_bt_1799_1)
    buildType(subProj_bt_1799_0)
    buildType(subProj_bt_1799_3)
    buildType(subProj_bt_1799_2)
})
