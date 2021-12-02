package subProj_1692

import subProj_1692.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1692")
    name = "subProj 1692"

    buildType(subProj_bt_1692_3)
    buildType(subProj_bt_1692_2)
    buildType(subProj_bt_1692_1)
    buildType(subProj_bt_1692_0)
    buildType(subProj_bt_1692_5)
    buildType(subProj_bt_1692_4)
})
