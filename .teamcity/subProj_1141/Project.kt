package subProj_1141

import subProj_1141.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1141")
    name = "subProj 1141"

    buildType(subProj_bt_1141_5)
    buildType(subProj_bt_1141_0)
    buildType(subProj_bt_1141_3)
    buildType(subProj_bt_1141_4)
    buildType(subProj_bt_1141_1)
    buildType(subProj_bt_1141_2)
})
