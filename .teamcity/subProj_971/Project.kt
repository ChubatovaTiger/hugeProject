package subProj_971

import subProj_971.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_971")
    name = "subProj 971"

    buildType(subProj_bt_971_0)
    buildType(subProj_bt_971_2)
    buildType(subProj_bt_971_1)
    buildType(subProj_bt_971_4)
    buildType(subProj_bt_971_3)
    buildType(subProj_bt_971_5)
})
