package subProj_1305

import subProj_1305.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1305")
    name = "subProj 1305"

    buildType(subProj_bt_1305_4)
    buildType(subProj_bt_1305_3)
    buildType(subProj_bt_1305_5)
    buildType(subProj_bt_1305_0)
    buildType(subProj_bt_1305_2)
    buildType(subProj_bt_1305_1)
})
