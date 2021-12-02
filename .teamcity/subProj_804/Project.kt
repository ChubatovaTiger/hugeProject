package subProj_804

import subProj_804.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_804")
    name = "subProj 804"

    buildType(subProj_bt_804_0)
    buildType(subProj_bt_804_1)
    buildType(subProj_bt_804_2)
    buildType(subProj_bt_804_3)
    buildType(subProj_bt_804_4)
    buildType(subProj_bt_804_5)
})
