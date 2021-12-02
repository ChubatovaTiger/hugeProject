package subProj_1337

import subProj_1337.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1337")
    name = "subProj 1337"

    buildType(subProj_bt_1337_4)
    buildType(subProj_bt_1337_5)
    buildType(subProj_bt_1337_2)
    buildType(subProj_bt_1337_3)
    buildType(subProj_bt_1337_0)
    buildType(subProj_bt_1337_1)
})
