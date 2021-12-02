package subProj_1514

import subProj_1514.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1514")
    name = "subProj 1514"

    buildType(subProj_bt_1514_4)
    buildType(subProj_bt_1514_3)
    buildType(subProj_bt_1514_5)
    buildType(subProj_bt_1514_0)
    buildType(subProj_bt_1514_2)
    buildType(subProj_bt_1514_1)
})
