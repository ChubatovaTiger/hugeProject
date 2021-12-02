package subProj_337

import subProj_337.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_337")
    name = "subProj 337"

    buildType(subProj_bt_337_0)
    buildType(subProj_bt_337_4)
    buildType(subProj_bt_337_3)
    buildType(subProj_bt_337_2)
    buildType(subProj_bt_337_1)
    buildType(subProj_bt_337_5)
})
