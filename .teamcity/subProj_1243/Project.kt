package subProj_1243

import subProj_1243.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1243")
    name = "subProj 1243"

    buildType(subProj_bt_1243_2)
    buildType(subProj_bt_1243_3)
    buildType(subProj_bt_1243_4)
    buildType(subProj_bt_1243_5)
    buildType(subProj_bt_1243_0)
    buildType(subProj_bt_1243_1)
})
