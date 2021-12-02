package subProj_1775

import subProj_1775.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1775")
    name = "subProj 1775"

    buildType(subProj_bt_1775_0)
    buildType(subProj_bt_1775_1)
    buildType(subProj_bt_1775_2)
    buildType(subProj_bt_1775_3)
    buildType(subProj_bt_1775_4)
    buildType(subProj_bt_1775_5)
})
