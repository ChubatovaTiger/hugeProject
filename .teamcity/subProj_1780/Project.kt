package subProj_1780

import subProj_1780.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1780")
    name = "subProj 1780"

    buildType(subProj_bt_1780_1)
    buildType(subProj_bt_1780_0)
    buildType(subProj_bt_1780_3)
    buildType(subProj_bt_1780_2)
    buildType(subProj_bt_1780_5)
    buildType(subProj_bt_1780_4)
})
