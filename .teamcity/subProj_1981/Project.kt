package subProj_1981

import subProj_1981.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1981")
    name = "subProj 1981"

    buildType(subProj_bt_1981_5)
    buildType(subProj_bt_1981_2)
    buildType(subProj_bt_1981_1)
    buildType(subProj_bt_1981_4)
    buildType(subProj_bt_1981_3)
    buildType(subProj_bt_1981_0)
})
