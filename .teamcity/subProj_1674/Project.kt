package subProj_1674

import subProj_1674.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1674")
    name = "subProj 1674"

    buildType(subProj_bt_1674_2)
    buildType(subProj_bt_1674_3)
    buildType(subProj_bt_1674_0)
    buildType(subProj_bt_1674_1)
    buildType(subProj_bt_1674_4)
    buildType(subProj_bt_1674_5)
})
