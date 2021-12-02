package subProj_514

import subProj_514.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_514")
    name = "subProj 514"

    buildType(subProj_bt_514_4)
    buildType(subProj_bt_514_5)
    buildType(subProj_bt_514_2)
    buildType(subProj_bt_514_3)
    buildType(subProj_bt_514_0)
    buildType(subProj_bt_514_1)
})
