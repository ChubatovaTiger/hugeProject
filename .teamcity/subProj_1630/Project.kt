package subProj_1630

import subProj_1630.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1630")
    name = "subProj 1630"

    buildType(subProj_bt_1630_0)
    buildType(subProj_bt_1630_1)
    buildType(subProj_bt_1630_2)
    buildType(subProj_bt_1630_3)
    buildType(subProj_bt_1630_4)
    buildType(subProj_bt_1630_5)
})
