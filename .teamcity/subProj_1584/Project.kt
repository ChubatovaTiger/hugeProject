package subProj_1584

import subProj_1584.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1584")
    name = "subProj 1584"

    buildType(subProj_bt_1584_1)
    buildType(subProj_bt_1584_0)
    buildType(subProj_bt_1584_3)
    buildType(subProj_bt_1584_2)
    buildType(subProj_bt_1584_5)
    buildType(subProj_bt_1584_4)
})
