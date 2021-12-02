package subProj_981

import subProj_981.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_981")
    name = "subProj 981"

    buildType(subProj_bt_981_0)
    buildType(subProj_bt_981_1)
    buildType(subProj_bt_981_4)
    buildType(subProj_bt_981_5)
    buildType(subProj_bt_981_2)
    buildType(subProj_bt_981_3)
})
