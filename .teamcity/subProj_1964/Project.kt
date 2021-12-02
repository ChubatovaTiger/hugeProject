package subProj_1964

import subProj_1964.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1964")
    name = "subProj 1964"

    buildType(subProj_bt_1964_0)
    buildType(subProj_bt_1964_1)
    buildType(subProj_bt_1964_2)
    buildType(subProj_bt_1964_3)
    buildType(subProj_bt_1964_4)
    buildType(subProj_bt_1964_5)
})
