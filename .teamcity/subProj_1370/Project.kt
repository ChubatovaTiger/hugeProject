package subProj_1370

import subProj_1370.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1370")
    name = "subProj 1370"

    buildType(subProj_bt_1370_0)
    buildType(subProj_bt_1370_1)
    buildType(subProj_bt_1370_2)
    buildType(subProj_bt_1370_3)
    buildType(subProj_bt_1370_4)
    buildType(subProj_bt_1370_5)
})
