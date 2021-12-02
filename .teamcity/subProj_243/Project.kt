package subProj_243

import subProj_243.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_243")
    name = "subProj 243"

    buildType(subProj_bt_243_5)
    buildType(subProj_bt_243_3)
    buildType(subProj_bt_243_4)
    buildType(subProj_bt_243_1)
    buildType(subProj_bt_243_2)
    buildType(subProj_bt_243_0)
})
