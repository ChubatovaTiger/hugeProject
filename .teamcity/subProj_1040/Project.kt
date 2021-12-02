package subProj_1040

import subProj_1040.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1040")
    name = "subProj 1040"

    buildType(subProj_bt_1040_3)
    buildType(subProj_bt_1040_4)
    buildType(subProj_bt_1040_5)
    buildType(subProj_bt_1040_0)
    buildType(subProj_bt_1040_1)
    buildType(subProj_bt_1040_2)
})
