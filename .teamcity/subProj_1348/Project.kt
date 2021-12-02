package subProj_1348

import subProj_1348.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1348")
    name = "subProj 1348"

    buildType(subProj_bt_1348_5)
    buildType(subProj_bt_1348_4)
    buildType(subProj_bt_1348_3)
    buildType(subProj_bt_1348_2)
    buildType(subProj_bt_1348_1)
    buildType(subProj_bt_1348_0)
})
