package subProj_1838

import subProj_1838.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1838")
    name = "subProj 1838"

    buildType(subProj_bt_1838_3)
    buildType(subProj_bt_1838_2)
    buildType(subProj_bt_1838_5)
    buildType(subProj_bt_1838_4)
    buildType(subProj_bt_1838_1)
    buildType(subProj_bt_1838_0)
})
