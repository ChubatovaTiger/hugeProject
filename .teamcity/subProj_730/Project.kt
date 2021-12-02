package subProj_730

import subProj_730.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_730")
    name = "subProj 730"

    buildType(subProj_bt_730_3)
    buildType(subProj_bt_730_2)
    buildType(subProj_bt_730_1)
    buildType(subProj_bt_730_0)
    buildType(subProj_bt_730_5)
    buildType(subProj_bt_730_4)
})
