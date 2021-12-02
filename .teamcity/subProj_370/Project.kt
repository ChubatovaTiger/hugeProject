package subProj_370

import subProj_370.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_370")
    name = "subProj 370"

    buildType(subProj_bt_370_5)
    buildType(subProj_bt_370_4)
    buildType(subProj_bt_370_1)
    buildType(subProj_bt_370_0)
    buildType(subProj_bt_370_3)
    buildType(subProj_bt_370_2)
})
