package subProj_692

import subProj_692.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_692")
    name = "subProj 692"

    buildType(subProj_bt_692_5)
    buildType(subProj_bt_692_0)
    buildType(subProj_bt_692_1)
    buildType(subProj_bt_692_2)
    buildType(subProj_bt_692_3)
    buildType(subProj_bt_692_4)
})
