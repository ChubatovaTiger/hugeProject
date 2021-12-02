package subProj_1006

import subProj_1006.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1006")
    name = "subProj 1006"

    buildType(subProj_bt_1006_0)
    buildType(subProj_bt_1006_3)
    buildType(subProj_bt_1006_4)
    buildType(subProj_bt_1006_1)
    buildType(subProj_bt_1006_2)
    buildType(subProj_bt_1006_5)
})
