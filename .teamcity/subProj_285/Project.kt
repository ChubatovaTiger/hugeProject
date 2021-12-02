package subProj_285

import subProj_285.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_285")
    name = "subProj 285"

    buildType(subProj_bt_285_5)
    buildType(subProj_bt_285_4)
    buildType(subProj_bt_285_3)
    buildType(subProj_bt_285_2)
    buildType(subProj_bt_285_1)
    buildType(subProj_bt_285_0)
})
