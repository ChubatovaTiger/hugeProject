package subProj_1057

import subProj_1057.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1057")
    name = "subProj 1057"

    buildType(subProj_bt_1057_5)
    buildType(subProj_bt_1057_2)
    buildType(subProj_bt_1057_1)
    buildType(subProj_bt_1057_4)
    buildType(subProj_bt_1057_3)
    buildType(subProj_bt_1057_0)
})
