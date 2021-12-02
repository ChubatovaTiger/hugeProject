package subProj_439

import subProj_439.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_439")
    name = "subProj 439"

    buildType(subProj_bt_439_1)
    buildType(subProj_bt_439_0)
    buildType(subProj_bt_439_3)
    buildType(subProj_bt_439_2)
    buildType(subProj_bt_439_5)
    buildType(subProj_bt_439_4)
})
