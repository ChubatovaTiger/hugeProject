package subProj_1730

import subProj_1730.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1730")
    name = "subProj 1730"

    buildType(subProj_bt_1730_5)
    buildType(subProj_bt_1730_3)
    buildType(subProj_bt_1730_4)
    buildType(subProj_bt_1730_1)
    buildType(subProj_bt_1730_2)
    buildType(subProj_bt_1730_0)
})
