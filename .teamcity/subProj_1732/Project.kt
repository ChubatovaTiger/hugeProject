package subProj_1732

import subProj_1732.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1732")
    name = "subProj 1732"

    buildType(subProj_bt_1732_3)
    buildType(subProj_bt_1732_4)
    buildType(subProj_bt_1732_1)
    buildType(subProj_bt_1732_2)
    buildType(subProj_bt_1732_0)
    buildType(subProj_bt_1732_5)
})
