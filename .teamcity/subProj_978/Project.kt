package subProj_978

import subProj_978.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_978")
    name = "subProj 978"

    buildType(subProj_bt_978_4)
    buildType(subProj_bt_978_5)
    buildType(subProj_bt_978_2)
    buildType(subProj_bt_978_3)
    buildType(subProj_bt_978_0)
    buildType(subProj_bt_978_1)
})
