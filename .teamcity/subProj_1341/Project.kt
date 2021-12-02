package subProj_1341

import subProj_1341.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1341")
    name = "subProj 1341"

    buildType(subProj_bt_1341_1)
    buildType(subProj_bt_1341_2)
    buildType(subProj_bt_1341_0)
    buildType(subProj_bt_1341_5)
    buildType(subProj_bt_1341_3)
    buildType(subProj_bt_1341_4)
})
