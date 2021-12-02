package subProj_305

import subProj_305.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_305")
    name = "subProj 305"

    buildType(subProj_bt_305_2)
    buildType(subProj_bt_305_3)
    buildType(subProj_bt_305_0)
    buildType(subProj_bt_305_1)
    buildType(subProj_bt_305_4)
    buildType(subProj_bt_305_5)
})
