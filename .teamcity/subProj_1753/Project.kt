package subProj_1753

import subProj_1753.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1753")
    name = "subProj 1753"

    buildType(subProj_bt_1753_5)
    buildType(subProj_bt_1753_4)
    buildType(subProj_bt_1753_3)
    buildType(subProj_bt_1753_2)
    buildType(subProj_bt_1753_1)
    buildType(subProj_bt_1753_0)
})
