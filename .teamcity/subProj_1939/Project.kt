package subProj_1939

import subProj_1939.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1939")
    name = "subProj 1939"

    buildType(subProj_bt_1939_5)
    buildType(subProj_bt_1939_4)
    buildType(subProj_bt_1939_3)
    buildType(subProj_bt_1939_2)
    buildType(subProj_bt_1939_1)
    buildType(subProj_bt_1939_0)
})
